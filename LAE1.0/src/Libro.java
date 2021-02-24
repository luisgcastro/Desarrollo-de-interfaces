
public class Libro {
	
	
	private int id_libro;
    private int id_autor;
    private int id_editorial;
    private String titulo_libro;
    private String isbn_libro;
    private int paginas_libro;
	
    
    public Libro(int id_libro, int id_autor, int id_editorial, String titulo_libro, String isbn_libro,
			int paginas_libro) {
		super();
		this.id_libro = id_libro;
		this.id_autor = id_autor;
		this.id_editorial = id_editorial;
		this.titulo_libro = titulo_libro;
		this.isbn_libro = isbn_libro;
		this.paginas_libro = paginas_libro;
	}


	public int getId_libro() {
		return id_libro;
	}


	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}


	public int getId_autor() {
		return id_autor;
	}


	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}


	public int getId_editorial() {
		return id_editorial;
	}


	public void setId_editorial(int id_editorial) {
		this.id_editorial = id_editorial;
	}


	public String getTitulo_libro() {
		return titulo_libro;
	}


	public void setTitulo_libro(String titulo_libro) {
		this.titulo_libro = titulo_libro;
	}


	public String getIsbn_libro() {
		return isbn_libro;
	}


	public void setIsbn_libro(String isbn_libro) {
		this.isbn_libro = isbn_libro;
	}


	public int getPaginas_libro() {
		return paginas_libro;
	}


	public void setPaginas_libro(int paginas_libro) {
		this.paginas_libro = paginas_libro;
	}
	
	
    
    
    

}
