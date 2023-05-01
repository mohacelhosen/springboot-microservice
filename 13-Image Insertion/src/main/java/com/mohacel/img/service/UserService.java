package com.mohacel.img.service;

import com.mohacel.img.entity.UserEntity;
import com.mohacel.img.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class UserService  {
    @Autowired
    private IUserRepository repository;

    public void save() throws Exception{

        UserEntity user = new UserEntity("mohacel.hosen06@gmail.com","Mofacel",23,"Male");


        String imgPath = "D:\\Test\\mohacel.jpg";
        long size = Files.size(Paths.get(imgPath));
        byte[] img =  new byte[(int) size];
        FileInputStream fis = new FileInputStream( new File(imgPath));
        fis.read(img);
        user.setImage(img);
        fis.close();

        repository.save(user);
    }

}
