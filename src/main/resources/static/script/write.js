function cancle() {
    var con = confirm("登録をキャンセルしますか？\nキャンセルすると作成した内容は消えます。")

    if (con == true) {
        history.back();
    }
}

function write_send() {

}