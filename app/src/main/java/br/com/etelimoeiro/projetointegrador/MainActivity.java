package br.com.etelimoeiro.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.etelimoeiro.projetointegrador.activities.ActivityProduto;
import br.com.etelimoeiro.projetointegrador.activities.ListaProdutosActivity;
import br.com.etelimoeiro.projetointegrador.controller.ProdutoController;
import br.com.etelimoeiro.projetointegrador.db.ConexaoSQL;
import br.com.etelimoeiro.projetointegrador.domain.Produto;

public class MainActivity extends AppCompatActivity {

    private Button btnSalvarProduto;
    private Button btnListaProdutos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexaoSQL.getInstancia(this);

        this.btnSalvarProduto = (Button) findViewById(R.id.btnSalvarProduto);

        this.btnListaProdutos = (Button) findViewById(R.id.btnListaProdutos);

        this.btnSalvarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ActivityProduto.class);
                startActivity(intent);
            }
        });

        this.btnListaProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaProdutosActivity.class);
                startActivity(intent);
            }
        });

    }
}
