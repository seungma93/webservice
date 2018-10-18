var main = {
    init : function () {
        var _this = this;


        $('#btn-save').on('click', function () {
            _this.save();

        });

        $('#btn-signUp').on('click', function () {
            _this.signUp();

        })
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('글이 등록되었습니다.');
            location.reload();

        }).fail(function (error) {
            alert(error);
        });
    },

    signUp : function () {
        var data = {
            id: $('#id').val(),
            pw: $('#pw').val(),
            name: $('#name').val()
        };

        $.ajax({
            type: 'POST',
            url: '/signup',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('회원가입 되었습니다.');
            location.reload();

        }).fail(function (error) {
            alert(error);
        });

    }


};

main.init();