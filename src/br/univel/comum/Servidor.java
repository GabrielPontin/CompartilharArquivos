package br.univel.comum;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Servidor implements IServer {

	public static int PORTA = 1818;
	
	
	public void run() {
		try {
			IServer servico = (IServer) UnicastRemoteObject.exportObject(Servidor.this, 0);
			Registry registry = LocateRegistry.createRegistry(PORTA);
			registry.rebind(IServer.NOME_SERVICO, servico);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	@Override
	public void registrarCliente(Cliente c) throws RemoteException {
		
	}

	@Override
	public void publicarListaArquivos(Cliente c, List<Arquivo> lista) throws RemoteException {
		
	}

	@Override
	public Map<Cliente, List<Arquivo>> procurarArquivo(String query, TipoFiltro tipoFiltro, String filtro)
			throws RemoteException {
		return null;
	}

	@Override
	public byte[] baixarArquivo(Cliente cli, Arquivo arq) throws RemoteException {
		return null;
	}

	@Override
	public void desconectar(Cliente c) throws RemoteException {
		
	}

}
