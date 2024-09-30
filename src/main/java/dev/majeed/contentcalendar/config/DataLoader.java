package dev.majeed.contentcalendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

//@Controller
//public class DataLoader implements CommandLineRunner {
//
//    private final DataSource dataSource;
//
//    public DataLoader(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
////    @Override
////    public void run(String... args) throws Exception {
////        try(
////                Connection connection = dataSource.getConnection();
////                Statement statement = connection.createStatement();
////        ){
////            String sql = "CREATE TABLE tbl_content (\n" +
////                    "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
////                    "    title VARCHAR(255) NOT NULL,\n" +
////                    "    desc TEXT,\n" +
////                    "    status VARCHAR(50),\n" +
////                    "    content_type VARCHAR(50),\n" +
////                    "    created_at TIMESTAMP NOT NULL,\n" +
////                    "    updated_at TIMESTAMP NULL,\n" +
////                    "    url VARCHAR(255)\n" +
////                    ");";
////
////            statement.execute(sql);
////            System.out.println("Created table tbl_content");
////
////        } catch (Exception e) { e.printStackTrace();}
////    }
//}
