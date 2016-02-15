# Giai thừa
+ Nhập mảng số a  từ bàn phím
+ [Tính giai thừa của các số có trong mảng a](https://vi.wikipedia.org/wiki/Giai_th%E1%BB%ABa) vừa nhập
+ Tham khảo [tính Giai thừa dùng Đệ quy](https://vi.wikipedia.org/wiki/%C4%90%E1%BB%87_quy)
+ [Tham khảo các kiểu dữ liệu trong Java](http://stanford.com.vn/kien-thuc-lap-trinh/tin-chi-tiet/cagId/27/id/5645/cac-kieu-du-lieu-co-ban-trong-java)

```
//Ham tinh giai thua
public double calculateGiaiThua(double x)
    {
        if(x==0)
            return 1;
         
        return x*calculateGiaiThua(x-1);        
    }
    
//Phuong thuc hien thi ket qua tinh giai thua
    public void displayGiaiThuaNumber(double[] a, int n)
    {
        for(int i=0; i<n; i++)
           System.out.print(calculateGiaiThua(a[i]) + " ");
        System.out.println();
    }
```