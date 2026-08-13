public class q82 {
    public int dayOfYear(String date) {
        String m=date.substring(5,7), d=date.substring(8),y=date.substring(0,4);
        int mm=Integer.parseInt(m), dd=Integer.parseInt(d),yy=Integer.parseInt(y),feb=28;
        if(yy%400==0 || yy%100!=0&&yy%4==0)
            feb=29;
    
        if(mm==1)
            return dd;
        else if(mm==2)
            return 31+dd;
        else if(mm==3)
            return 31+feb+dd;
        else if(mm==4)
            return 31*2+feb+dd;
        else if(mm==5)
            return 31*2+30+feb+dd;
        else if(mm==6)
            return 31*3+30+feb+dd;
        else if(mm==7)
            return 31*3+30*2+feb+dd;
        else if(mm==8)
            return 31*4+30*2+feb+dd;
        else if(mm==9)
            return 31*5+30*2+feb+dd;
        else if(mm==10)
            return 31*5+30*3+feb+dd;
        else if(mm==11)
            return 31*6+30*3+feb+dd;
            return 31*6+30*4+feb+dd;
        
    }
}
