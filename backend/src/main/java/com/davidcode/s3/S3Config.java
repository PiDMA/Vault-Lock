package com.davidcode.s3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

//Amazon config
@Configuration
public class S3Config {

//    @Value("${aws.region")
//    private String awsRegion;

    @Bean
    public S3Client s3Client(){
        S3Client client = S3Client.builder()
                .region(Region.US_EAST_2)
                .build();
        return client;
    }
}
