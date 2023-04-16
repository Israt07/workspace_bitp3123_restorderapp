package my.edu.utem.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "OrderType")
public class OrderType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderTypeId")
    private Long orderTypeId;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "name")
    private String name;
    
    public OrderType() {}
    
    public OrderType(Long orderTypeId, String code, String name) {
        this.orderTypeId = orderTypeId;
        this.code = code;
        this.name = name;
    }
    
    public Long getOrderTypeId() {
        return orderTypeId;
    }
    
    public void setOrderTypeId(Long orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

	
}