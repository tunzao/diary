/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/4/13
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
$(function () {
    $("input[name=name]").blur(function () {

        if (this.value == "") {
            $(this).parent().next().remove();
            $(this).parent().after($("<span class='help-inline'>用户名不能为空</span>"));
            var $parent = $(this).parent().parent().parent();
            if (!$parent.hasClass("error")) {
                $parent.addClass("error");
            }
        } else {
            var $next = $(this).next();
            if ($next.is("span")) {
                $next.remove();
            }
            var name = this.value;
            var $self = $(this);
            $.post(
                "/userExists",
                {
                    name: name
                },
                function (data, status) {
                    if (data.obj) {
                        var $n = $self.next();
                        if (!$n.is("span")) {
                            $self.after($("<span class='required'>用户名已存在</span> "));
                        }
                    } else {
                        var $n = $self.next();
                        if ($n.is("span")) {
                            $n.remove();
                        }
                    }
                },
                "json");
        }
    });

    $("input[name=password]").blur(function () {
        if (this.value == "" || this.value.length < 6) {
            $(this).next("span").remove();
            $(this).after($("<span class='required'>密码长度不能小于6</span>"))
        } else {
            $(this).next("span").remove();
        }
    });

    $("input[name=email]").blur(function () {
        if (this.value == "" || (this.value != "" && !/^.+@.+\.[a-zA-Z]{2,4}$/.test(this.value))) {
            $next = $(this).next("span");
            $next.remove();
            $(this).after($("<span class='required'>邮箱地址有误</span>"));
        } else {
            $(this).next("span").remove();
        }
    });

    $("input[name=passwordAgain]").blur(function () {
        var pass = $("input[name=password]")[0].value;
        var passAgain = this.value;
        if (pass != passAgain) {
            var $next = $(this).next("span");
            $next.remove();
            $(this).after($("<span class='required'>两次密码不相同</span> "));
        } else {
            $(this).next("span").remove();
        }
    });
})
;
