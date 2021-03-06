package br.com.pcsist.demo.produto.domain.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.pcsist.demo.produto.domain.Produto;

final class ProdutoRowMapper implements RowMapper<Produto> {

  @Override
  public Produto mapRow(ResultSet rs, int rowNum) throws SQLException {
    Produto produto = new Produto();
    produto.setCodigo(rs.getInt("codprod"));
    produto.setDescricao(rs.getString("descricao"));
    return produto;
  }

}
