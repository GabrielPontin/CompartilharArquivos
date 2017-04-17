package br.pontin.tabela;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import br.pontin.comum.Arquivo;
import br.pontin.comum.Cliente;

public class ModelArquivo extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private Object[][] mat;
	private int lines;
	
	public ModelArquivo(Map<Cliente, List<Arquivo>> mapa){
		
		lines = 0;
		for (Entry<Cliente, List<Arquivo>> e :
			mapa.entrySet()) {
		lines += e.getValue().size();
		}
		
		mat = new Object[lines][8];
		
		int line = 0;
		
		for (Entry<Cliente, List<Arquivo>> e : mapa.entrySet()) {
			for (Arquivo arq: e.getValue()){
				
				mat[lines][0] = e.getKey().getNome();
				mat[lines][1] = e.getKey().getIp();
				mat[lines][2] = arq.getNome();
				mat[lines][3] = e.getKey().getPorta();
				mat[lines][4] = arq.getExtensao();
				mat[lines][5] = arq.getPath();
				mat[lines][6] = arq.getTamanho();
				mat[lines][7] = arq.getMd5();
				lines++;
				
		}
	}
}
	
	
	
	public int getRowCount() {
		return lines;
	}

	public int getColumnCount() {
		return 8;
	}

	public Object getValueAt(int lineIndex, int colunaIndex) {
		return mat[lineIndex][colunaIndex];
	}


	@Override
	public String getColumnName(int cname) {
		
		
		switch(cname){
		case 0: 
			return "Nome Cliente ";
		case 1:
			return "IP Cliente";
		case 2: 
			return "Nome do Arquivo";
		case 3: 
			return "Porta";
		case 4: 
			return "Extensao";
		case 5: 
			return "Path";
		case 6: 
			return "Tamanho";
		case 7: 
			return "HashMD5";
		default:
		}
		
		return null;

	}
}

