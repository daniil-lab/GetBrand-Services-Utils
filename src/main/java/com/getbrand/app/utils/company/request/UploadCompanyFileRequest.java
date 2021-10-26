package com.getbrand.app.utils.company.request;

import org.springframework.web.multipart.MultipartFile;

public class UploadCompanyFileRequest {

    private MultipartFile[] file;

    public UploadCompanyFileRequest() {};

    public UploadCompanyFileRequest(MultipartFile[] file) {
        this.file = file;
    }

    public MultipartFile[] getFile() {
        return file;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }
}
