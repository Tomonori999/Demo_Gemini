public class App {
    public static void main(String[] args) throws Exception {
        String name;

        //  推論: args.length > 0 で、実行時に引数が渡されたかをチェックします。
        if (args.length > 0) {
            // 最初の引数 (args[0]) を名前として使用します。
            name = args[0];
        } else {
            // 引数が渡されなかった場合のデフォルトの名前を設定します。
            name = "皆さん"; 
        }

        // 挨拶メッセージを構築して出力します。
        System.out.println(name + "さん、こんにちは！");
    }
}