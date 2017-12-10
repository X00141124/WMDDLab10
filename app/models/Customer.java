package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Customer extends Model {
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String address;
    @Constraints.Required
    private String number;
    @Constraints.Required
    private String dob;

    public Customer() {
        
        }

        public Customer(Long id, String name, String address, String number, String dob) {
            
            this.id = id;
            
            this.name = name;
            
            this.address = address;
            
            this.number = number;
            
            this.dob = dob;
            
            }    

            public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
            
            
            public static final List<Customer> findAll(){
                return Customer.find.all();
            }


    public void setId(Long id){
        this.id = id;
            }
            public Long getId(){
                return this.id;
            }

    public void setName(String name){
        this.name = name;
            }
            public String getName(){
                return this.name;
            }
    
    public void setAddress(String address){
        this.address = address;
            }
            public String getAddress(){
                return this.address;
            }

    public void setNumber(String number){
        this.number = number;
            }
            public String getNumber(){
                return this.number;
            }
    
    public void setDob(String dob){
        this.dob = dob;
            }
            public String getDob(){
                return this.dob;
            }

            
                
                }
    