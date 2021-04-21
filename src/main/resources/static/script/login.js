
// 취소 후 이전 페이지로 이동

function login() {
    if (login_form.userid.value == "") {
        alert("IDを入力してください。")
        login_form.userid.focus()
        return
    }else if (login_form.passwd.value == ""){
        alert("パスワードを入力してください。")
        login_form.passwd.focus()
        return
    }

    login_form.submit()
}


function cancle() {
    var con = confirm("前のページに戻りますか？")

    if (con == true) {
        history.back();
    }
}