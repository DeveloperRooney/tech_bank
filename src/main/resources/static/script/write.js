function cancle() {
    var con = confirm("登録をキャンセルしますか？\nキャンセルすると作成した内容は消えます。")

    if (con == true) {
        history.back();
    }
}

function write_send() {
    if (write_frm.subject.value == '') {
        alert("案件名を入力してください。")
        write_frm.subject.focus()
        return
    }else if (write_frm.term.value == '') {
        alert("契約期間を入力してください。")
        write_frm.term.focus()
        return
    }else if (write_frm.loc.value == '') {
        alert("勤務地を入力してください。")
        write_frm.loc.focus()
        return
    }else if (write_frm.monthlv.value == '') {
        alert("月額単位を入力してください。")
        write_frm.monthlv.focus()
        return
    }else if (write_frm.category.value == '') {
        alert("カテゴリーを入力してください。")
        write_frm.category.focus()
        return
    }else if (write_frm.skill.value == '') {
        alert("必要スキルを入力してください。")
        write_frm.skill.focus()
        return
    }else if (write_frm.consultcnt.value == '') {
        alert("面談回数を入力してください。")
        write_frm.consultcnt.focus()
        return
    }else if (write_frm.etc.value == '') {
        alert("その他のところを入力してください。")
        write_frm.etc.focus()
        return
    }

    write_frm.submit();
}