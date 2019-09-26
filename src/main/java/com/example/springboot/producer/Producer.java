//package com.example.springboot.producer;
//
//import com.alibaba.fastjson.JSON;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.common.message.Message;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Random;
//
//public class Producer {
//
//    public static void main(String[] args) throws MQClientException {
//
//        Integer[] list = new Integer[]{2,34};
//        DefaultMQProducer producer = new DefaultMQProducer("test-group_222");
//        producer.setNamesrvAddr("192.168.66.37:9876");
//        producer.setInstanceName("rmq-instance_22q");
//        producer.start();
//        try {
////            for (int i=0;i<5; i++){
//                User user = new User();
//                user.setUid((long) (242));
////                user.setInvitedUid((long) (605 + i));
//                user.setUserType(1);
//                user.setTransSubType(2);
//                user.setFromUid(505);
//                user.setAmount(new BigDecimal(1000));
//                user.setOrderNo("444444");
//                user.setToUid(570);
//                user.setStatus(0);
//                Message message = new Message("tran_dev_xiewei_2", "invite_222", JSON.toJSONString(user).getBytes());
//                System.out.println("生产者发送消息:"+JSON.toJSONString(user));
//                producer.send(message);
////            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        producer.shutdown();
//
//
//    }
//
//    /**
//     * 发送用户消息
//     */
//    static  class User implements Serializable {
//        private Long uid;
//        private Long invitedUid;
//        private Integer userType;
//        private Integer fromUid;
//        private BigDecimal amount;
//        private String orderNo;
//        private Integer transSubType;
//        private Integer status;
//
//        public Integer getToUid() {
//            return toUid;
//        }
//
//        public void setToUid(Integer toUid) {
//            this.toUid = toUid;
//        }
//
//        private Integer toUid;
//
//
//
//        public Long getUid() {
//            return uid;
//        }
//
//        public void setUid(Long uid) {
//            this.uid = uid;
//        }
//
//        public Long getInvitedUid() {
//            return invitedUid;
//        }
//
//        public void setInvitedUid(Long invitedUid) {
//            this.invitedUid = invitedUid;
//        }
//
//        public Integer getUserType() {
//            return userType;
//        }
//
//        public void setUserType(Integer userType) {
//            this.userType = userType;
//        }
//
//        public Integer getFromUid() {
//            return fromUid;
//        }
//
//        public void setFromUid(Integer fromUid) {
//            this.fromUid = fromUid;
//        }
//
//        public BigDecimal getAmount() {
//            return amount;
//        }
//
//        public void setAmount(BigDecimal amount) {
//            this.amount = amount;
//        }
//
//        public String getOrderNo() {
//            return orderNo;
//        }
//
//        public void setOrderNo(String orderNo) {
//            this.orderNo = orderNo;
//        }
//
//        public Integer getTransSubType() {
//            return transSubType;
//        }
//
//        public void setTransSubType(Integer transSubType) {
//            this.transSubType = transSubType;
//        }
//
//        public Integer getStatus() {
//            return status;
//        }
//
//        public void setStatus(Integer status) {
//            this.status = status;
//        }
//    }
//
//}
