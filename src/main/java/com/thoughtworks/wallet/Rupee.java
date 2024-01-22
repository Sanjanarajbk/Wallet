package com.thoughtworks.wallet;



public class Rupee {
     final double value;
    public Rupee(double value) throws Exception {
        if(value<0){
            throw new Exception();
        }else{
        this.value=value;
        }
    }
   
   public Rupee add(Rupee rupee ) throws Exception{

    Rupee total = new Rupee(this.value + rupee.value);
    return total;
   }

   @Override
   public boolean equals(Object obj){
    if(obj == this){
        return true;
    }
    if(obj == null ){
        return false;
    }
   if(this.getClass() != obj.getClass()){
    return false;
   }

   Rupee other = (Rupee) obj;
   if(this.value != other.value){
    return false;
   }

   return true;
   
    
}

@Override
public int hashCode(){
    int hash =3;
    hash = 53 * hash + (int)this.value;
        return hash;
        
}
}
