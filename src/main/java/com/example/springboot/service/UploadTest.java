package com.example.springboot.service;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;

/**
 * Create By Stream Wind On 2019/5/6
 */
public class UploadTest {

    private static String AWS_ACCESS_KEY = "xxxxxxxx"; // 【你的 access_key】
    private static String AWS_SECRET_KEY = "xxxxxxxx"; // 【你的 aws_secret_key】

    private static String bucketName = "xxxxxxx"; // 【你 bucket 的名字】 # 首先需要保证 s3 上已经存在该存储桶

    private static final AmazonS3 s3;

    static {
        s3 = new AmazonS3Client(new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY));
        s3.setRegion(Region.getRegion(Regions.US_EAST_1)); // 此处根据自己的 s3 地区位置改变
    }

    public static String uploadToS3(File tempFile, String remoteFileName) throws IOException {
        try {
            String bucketPath = bucketName + "/upload" ;
            s3.putObject(new PutObjectRequest(bucketPath, remoteFileName, tempFile)
                    .withCannedAcl(CannedAccessControlList.PublicRead));
            GeneratePresignedUrlRequest urlRequest = new GeneratePresignedUrlRequest(bucketName, remoteFileName);
            URL url = s3.generatePresignedUrl(urlRequest);
            return url.toString();
        } catch (AmazonServiceException ase) {
            ase.printStackTrace();
        } catch (AmazonClientException ace) {
            ace.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        File uploadFile = new File("c:/test.txt");
        String uploadKey = "test";
        uploadToS3(uploadFile,uploadKey);
    }


}
