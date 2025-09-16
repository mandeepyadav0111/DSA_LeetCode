class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        process(sb,'*','*','M',num/1000);
        num%=1000;
          process(sb,'M','D','C',num/100);
        num%=100;
          process(sb,'C','L','X',num/10);
        num%=10;
        process(sb,'X','V','I',num);

     
     return sb.toString();

    }
    void process(StringBuilder sb, char major, char mid , char minor, int val){
        if(val<=3){
            for(int i=0;i<val;i++){
                sb.append(minor);
            }   
        }
         else if(val==4){
                sb.append(minor);
                sb.append(mid);
            }
            else if(val==5){
                sb.append(mid);
            }
          else  if(val>5 && val<=8){
                sb.append(mid);
                for(int j=6;j<=val;j++){
                    sb.append(minor);
                }
            }
          else if(val==9){
            sb.append(minor);
            sb.append(major);
            
          }
        
     }
}