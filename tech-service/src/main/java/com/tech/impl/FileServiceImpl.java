package com.tech.impl;

import com.tech.FileService;

/**
 * @author lw
 * @since 2021/10/13
 */
public class FileServiceImpl implements FileService {
    @Override
    public void upload(String msg) {
        System.out.println("文件上传成功 "+msg);
    }
}
