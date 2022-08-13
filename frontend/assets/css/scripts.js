//ajuste background home candidata/empresa

function largura_bg_home_cadastrar() {
    var largura_tela = jQuery(window).width();
    var col_conteudo_home_cadastrar = jQuery('section#home-cadastrar #candidata').width();
    var bg_home_cadastrar = (largura_tela - (col_conteudo_home_cadastrar * 2)) / 2;
    alert(bg_home_cadastrar);
}

jQuery(window).resize(function() {
    largura_bg_home_cadastrar();
});

jQuery(document).load(function() {
    largura_bg_home_cadastrar();
});

