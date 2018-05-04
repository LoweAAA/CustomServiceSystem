package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "product", schema = "CustomerSurvice", catalog = "" )
public class Product {
    private String productId;
    private String productName;
    private String productModel;
    private String productState;
    private Date productCreationTime;
    private String categoryId;
    private Category categoryByCategoryId;
    private Collection<ProductQuestion> productQuestionsByProductId;

    @Id
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_model")
    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    @Basic
    @Column(name = "product_state")
    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState;
    }

    @Basic
    @Column(name = "product_creation_time")
    public Date getProductCreationTime() {
        return productCreationTime;
    }

    public void setProductCreationTime(Date productCreationTime) {
        this.productCreationTime = productCreationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productModel != null ? !productModel.equals(that.productModel) : that.productModel != null) return false;
        if (productState != null ? !productState.equals(that.productState) : that.productState != null) return false;
        if (productCreationTime != null ? !productCreationTime.equals(that.productCreationTime) : that.productCreationTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productModel != null ? productModel.hashCode() : 0);
        result = 31 * result + (productState != null ? productState.hashCode() : 0);
        result = 31 * result + (productCreationTime != null ? productCreationTime.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "category_id")
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @OneToMany(mappedBy = "productByProductName")
    public Collection<ProductQuestion> getProductQuestionsByProductId() {
        return productQuestionsByProductId;
    }

    public void setProductQuestionsByProductId(Collection<ProductQuestion> productQuestionsByProductId) {
        this.productQuestionsByProductId = productQuestionsByProductId;
    }
}
