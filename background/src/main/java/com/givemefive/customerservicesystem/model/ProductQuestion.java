package com.givemefive.customerservicesystem.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "product_question", schema = "CustomerSurvice", catalog = "")
public class ProductQuestion {
    private String proQuestionId;
    private String proQuestionName;
    private String productName;
    private Product productByProductName;
    private Collection<Repository> repositoriesByProQuestionId;

    @Basic
    @Id
    @Column(name = "pro_question_id", nullable = false, length = 20)
    public String getProQuestionId() {
        return proQuestionId;
    }

    public void setProQuestionId(String proQuestionId) {
        this.proQuestionId = proQuestionId;
    }

    @Basic
    @Column(name = "pro_question_name")
    public String getProQuestionName() {
        return proQuestionName;
    }

    public void setProQuestionName(String proQuestionName) {
        this.proQuestionName = proQuestionName;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductQuestion that = (ProductQuestion) o;

        if (proQuestionId != null ? !proQuestionId.equals(that.proQuestionId) : that.proQuestionId != null)
            return false;
        if (proQuestionName != null ? !proQuestionName.equals(that.proQuestionName) : that.proQuestionName != null)
            return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = proQuestionId != null ? proQuestionId.hashCode() : 0;
        result = 31 * result + (proQuestionName != null ? proQuestionName.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }

  /*  @ManyToOne
    @JoinColumn(name = "product_name", referencedColumnName = "product_id", nullable = false,insertable = false,updatable = false
    )
    public Product getProductByProductName() {
        return productByProductName;
    }

    public void setProductByProductName(Product productByProductName) {
        this.productByProductName = productByProductName;
    }

    @OneToMany(mappedBy = "productQuestionByProQuestionId")
    public Collection<Repository> getRepositoriesByProQuestionId() {
        return repositoriesByProQuestionId;
    }

    public void setRepositoriesByProQuestionId(Collection<Repository> repositoriesByProQuestionId) {
        this.repositoriesByProQuestionId = repositoriesByProQuestionId;
    }
    */

}
