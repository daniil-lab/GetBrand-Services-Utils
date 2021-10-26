package com.getbrand.app.utils.promo.models;

import com.getbrand.app.utils.company.models.Company;
import com.getbrand.app.utils.file.models.File;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Promo {
    @Id
    private UUID id;

    private String name;

    private String description;

    private String type;

    private double percent;

    private double summ;

    private String timeSpending;

    private boolean isAllow;

    private boolean isBanner;

    private boolean showOnMainScreen;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = File.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "promo_id")
    @ElementCollection
    private List<File> files;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    private Company company;

    public Promo() {};

    public Promo(String name,
                 String description,
                 String type,
                 double percent,
                 double summ,
                 String timeSpending) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.type = type;
        this.percent = percent;
        this.summ = summ;
        this.timeSpending = timeSpending;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public void removeFile(int idx) {
        this.files.remove(idx);
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getPercent() {
        return percent;
    }

    public double getSumm() {
        return summ;
    }

    public String getTimeSpending() {
        return timeSpending;
    }

    public boolean isAllow() {
        return isAllow;
    }

    public boolean isBanner() {
        return isBanner;
    }

    public boolean isShowOnMainScreen() {
        return showOnMainScreen;
    }

    public void setAllow(boolean allow) {
        isAllow = allow;
    }

    public void setBanner(boolean banner) {
        isBanner = banner;
    }

    public void setShowOnMainScreen(boolean showOnMainScreen) {
        this.showOnMainScreen = showOnMainScreen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public void setTimeSpending(String timeSpending) {
        this.timeSpending = timeSpending;
    }
}
