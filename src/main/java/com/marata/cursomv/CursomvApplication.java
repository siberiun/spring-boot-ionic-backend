package com.marata.cursomv;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marata.cursomv.domain.Categoria;
import com.marata.cursomv.domain.Cidade;
import com.marata.cursomv.domain.Cliente;
import com.marata.cursomv.domain.Endereco;
import com.marata.cursomv.domain.Estado;
import com.marata.cursomv.domain.ItemPedido;
import com.marata.cursomv.domain.Pagamento;
import com.marata.cursomv.domain.PagamentoComBoleto;
import com.marata.cursomv.domain.PagamentoComCartao;
import com.marata.cursomv.domain.Pedido;
import com.marata.cursomv.domain.Produto;
import com.marata.cursomv.domain.enums.EstadoPagamento;
import com.marata.cursomv.domain.enums.TipoCliente;
import com.marata.cursomv.repositories.CategoriaRepository;
import com.marata.cursomv.repositories.CidadeRepository;
import com.marata.cursomv.repositories.ClienteRepository;
import com.marata.cursomv.repositories.EnderecoRepository;
import com.marata.cursomv.repositories.EstadoRepository;
import com.marata.cursomv.repositories.ItemPedidoRepository;
import com.marata.cursomv.repositories.PagamentoRepository;
import com.marata.cursomv.repositories.PedidoRepository;
import com.marata.cursomv.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomvApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(CursomvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

	}

}
