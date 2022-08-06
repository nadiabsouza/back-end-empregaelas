//ajuste background home candidata/empresa

function largura_bg_home_cadastrar() {
    var largura_tela = jQuery(window).width();
    if (largura_tela < 1800) {
        var col_conteudo_home_cadastrar = jQuery('section#home-cadastrar #candidata').width();
        var bg_home_cadastrar = (((largura_tela / 100 * 95) - (col_conteudo_home_cadastrar * 2)) / 2) - 50;

        jQuery('section#home-cadastrar').css('background-size' , bg_home_cadastrar + 'px');
    }

    else {
        jQuery('section#home-cadastrar').css('background-size' , '400px');
    }
}

jQuery(window).resize(function() {
    largura_bg_home_cadastrar();
});

jQuery(document).ready(function() {
    largura_bg_home_cadastrar();
});

