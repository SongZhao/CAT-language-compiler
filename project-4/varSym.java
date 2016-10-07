class varSym extends SemSym {
    private String kind;
   
    
    public varSym(String kind) {
        super("varDecl");
        this.kind = kind;
    }
    
    public String getKind()
    {
	return this.kind;
    }
    
}
