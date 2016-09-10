public class BMR
{
  public float WeightinPound, heightinInches, ageinYear;
   
  public BMR( float WeightinPound, float heightinInches, float ageinYear) 
  {
  
    this.WeightinPound = WeightinPound;
    this.heightinInches = heightinInches; 
    this.ageinYear = ageinYear; 

  
  }
  
  public float WomenBMR()
  {
    return 655+(4.35f * WeightinPound) + (4.7f * heightinInches) - (4.7f * ageinYear ); 
   
  }
  
  public float MenBMR()
  {
    return 66+(6.23f * WeightinPound) + (12.7f * heightinInches) - (6.8f * ageinYear ); 
   
  }
  
  public float SedentaryWomen()
  {
  
   return WomenBMR()* 1.2f;
  
  }  
  
   public float Sedentarymen()
   { 
     return MenBMR()* 1.2f;
  
   }  

   public float lightlyActiveWomen()
   {
     
    return WomenBMR()*1.375f;
   
   }  

   public float lightlyActiveMen()
   {
     
    return MenBMR()*1.375f;
   
   }  
   
   
   public float moderatelyActiveWomen()
   {
     return WomenBMR()*1.55f;
   
   }
   
   public float moderatelyActiveMen()
   {
     return MenBMR()*1.55f;
   
   }
   
   public float veryActiveWomen()
   {
   return WomenBMR()*1.725f;
     
   }
   
   public float veryActiveMen()
   {
   return MenBMR() * 1.725f;  
     
   }
   
   public float extraActiveWomen()
   {
     return WomenBMR()* 1.9f;
    
   }  
   
   public float extraActiveMen()
   {
     return MenBMR()* 1.9f;
    
   }  
}