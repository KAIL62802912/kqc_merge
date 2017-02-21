/**
 * Created by kail on 2017/2/21.
 */
public class kqc_merge {


    public static String merge(String... Data) {
        int iDataCount = Data.length;
        String sReturnData = Data[0];
        for (int i = 1; i < iDataCount; i++) {
            String sTempData=Data[i];
            //获得短字符串的长度作为循环次数
            int iShortCount=sReturnData.length()>sTempData.length()?sTempData.length():sReturnData.length();
            //获得需要拼接的字符串
            String sShortData=sReturnData.length()>sTempData.length()?"":sTempData.substring(iShortCount);
            //进行循环
            for (int h=0;h<iShortCount;h++){
                String sReturnDataH=sReturnData.substring(h,h+1);
                String sTempDataH=sTempData.substring(h,h+1);
                if (!sReturnDataH.equals(sTempDataH)){
                    sReturnData=sReturnData.substring(0,h)+"1"+sReturnData.substring(h+1);
                }

            }
            sReturnData+=sShortData;
            //进行拼接

        }
        return sReturnData;

    }

    public static void main(String[] args) {
        String[] arrData = {"1000", "11111100", "1001010100"};
        String a=merge(arrData);
        System.out.println(a);

    }
}
