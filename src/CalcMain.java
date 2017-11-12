public class CalcMain {

    /**
     * エントリーポイント.
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            // 引数が未指定の場合
            System.out.println("Please [formula] input.\n\n java CalcMain [fourmula]");
            return;
        }

        // 引数を空白で結合
        String formula = String.join(" ", args);


        // 計算の実施
        try {
            ICalcProcess process = new CalcProcess();
            String result = process.exec(formula);

            // 結果の出力
            System.out.println(result);
        } catch (Exception ex) {
            // 例外メッセージの出力
            System.out.println(ex.getMessage());
            // Debug用にError出力にスタックトレースを出力
            ex.printStackTrace(System.err);
        }

    }
}
