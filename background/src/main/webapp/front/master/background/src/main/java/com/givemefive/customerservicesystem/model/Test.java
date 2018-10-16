package com.givemefive.customerservicesystem.model;

import javax.persistence.*;

@Entity
@Table(name="test")
public class Test {
    private int testId;
    private String testContext;

    @Id
    @Column(name = "test_id", nullable = false)
    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    @Basic
    @Column(name = "test_context", nullable = true, length = 45)
    public String getTestContext() {
        return testContext;
    }

    public void setTestContext(String testContext) {
        this.testContext = testContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (testId != test.testId) return false;
        if (testContext != null ? !testContext.equals(test.testContext) : test.testContext != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = testId;
        result = 31 * result + (testContext != null ? testContext.hashCode() : 0);
        return result;
    }
}
