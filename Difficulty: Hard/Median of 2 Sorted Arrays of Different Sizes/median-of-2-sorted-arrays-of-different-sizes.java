class Solution {
    public double medianOf2(int a[], int b[]) {
        if(b.length<a.length){
            return medianOf2(b,a);
        }
        int l=0,h=a.length;
        while(l<=h){
            int m1 = (l+h)/2;
            int m2 = ((a.length+b.length+1)/2)-m1;
            
            int l1= (m1==0)? Integer.MIN_VALUE: a[m1-1];
            int r1 = (m1==a.length)? Integer.MAX_VALUE : a[m1];
            
            int l2 =(m2==0)? Integer.MIN_VALUE:b[m2-1];
            int r2  = (m2==b.length)?Integer.MAX_VALUE : b[m2];
            
            if(l1<=r2 && l2<=r1){
                if((a.length+b.length)%2==0){
                    return(float)(Integer.max(l1,l2)+Integer.min(r1,r2))/2;
                }else{
                    return (float)Integer.max(l1,l2);
                }
            }
            else if(l2>l1){
                l=m1+1;
            }else{
                h=m1-1;
            }
        }
        return 0.0f;
    }
}