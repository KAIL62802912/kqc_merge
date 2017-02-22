/**
 * Created by kail on 2017/2/21.
 */
public class kqc_merge {

    public static void main(String[] args) {
        String[] arrData = {"1000", "11111100", "1001010100"};
        String a=merge(arrData);
        System.out.println(a);

    }
    public static String merge(String... Data) {
        //数据源长度
        int iDataCount = Data.length;
        //第一个数据
        String sReturnData = Data[0];
        for (int i = 1; i < iDataCount; i++) {
            //依次进行比较的数据
            String sTempData=Data[i];
            //获得短字符串的长度作为循环次数
            int iShortCount=sReturnData.length()>sTempData.length()?sTempData.length():sReturnData.length();
            //较长数据的多出来部分直接进行拼接在结果，不需要比较
            String sShortData=sReturnData.length()>sTempData.length()?"":sTempData.substring(iShortCount);
            //进行循环
            for (int h=0;h<iShortCount;h++){
                //两条数据依次比较
                String sReturnDataH=sReturnData.substring(h,h+1);
                String sTempDataH=sTempData.substring(h,h+1);
                if (!sReturnDataH.equals(sTempDataH)){
                    //拼接比较结果
                    sReturnData=sReturnData.substring(0,h)+"1"+sReturnData.substring(h+1);
                }

            }
            //给比较的结果拼接上长数据多出来的部分
            sReturnData+=sShortData;

        }
        return sReturnData;

    }
}
