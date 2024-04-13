/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;
public class DisplayModel {
    public Object displayMember,DisplayValue ;
     public DisplayModel() {
   
    }
    public DisplayModel(Object displayMember, Object displayvalue) {
        this.displayMember = displayMember;
        this.DisplayValue = displayvalue;
    }
    @Override
    public String toString(){
        return displayMember.toString();
    }

}
