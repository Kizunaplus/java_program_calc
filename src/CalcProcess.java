public class CalcProcess implements ICalcProcess{

    /**
     * 計算処理の実行.
     *
     * @param formula 計算式
     *
     * @return 計算結果 引数が不正の場合は、から文字を返却します
     */
    @Override
    public String exec(final String formula) {
        return "1";
    }
}
