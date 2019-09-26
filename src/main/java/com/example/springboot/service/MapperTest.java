package com.example.springboot.service;

import com.example.springboot.dto.ConverMapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author Archer
 * @date 2019-07-29
 */
public class MapperTest {

    public static <T> T getMapper(Class<T> clazz) {
        try {
            List<ClassLoader> classLoaders = new ArrayList<ClassLoader>( 3 );
            classLoaders.add( clazz.getClassLoader() );

            if ( Thread.currentThread().getContextClassLoader() != null ) {
                classLoaders.add( Thread.currentThread().getContextClassLoader() );
            }

            classLoaders.add( Mappers.class.getClassLoader() );

            return getMapper( clazz, classLoaders );
        }
        catch ( ClassNotFoundException e ) {
            throw new RuntimeException( e );
        }
    }


    private static <T> T getMapper(
            Class<T> mapperType, Iterable<ClassLoader> classLoaders) throws ClassNotFoundException {

        for ( ClassLoader classLoader : classLoaders ) {
            T mapper = doGetMapper( mapperType, classLoader );
            if ( mapper != null ) {
                return mapper;
            }
        }

        throw new ClassNotFoundException("Cannot find implementation for " + mapperType.getName() );
    }

    private static <T> T doGetMapper(Class<T> clazz, ClassLoader classLoader) {
        try {
            @SuppressWarnings("unchecked")
            T mapper = (T) classLoader.loadClass( clazz.getName() + "Impl" ).newInstance();
            return mapper;
        }
        catch (ClassNotFoundException e) {
            ServiceLoader<T> loader = ServiceLoader.load( clazz, classLoader );

            if ( loader != null ) {
                for ( T mapper : loader ) {
                    if ( mapper != null ) {
                        return mapper;
                    }
                }
            }

            return null;
        }
        catch (InstantiationException e) {
            throw new RuntimeException( e );
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException( e );
        }
    }


    public static void main(String[] args) {
        ConverMapper mapper = getMapper(ConverMapper.class);
    }
}
