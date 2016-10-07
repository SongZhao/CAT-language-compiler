class StructSym extends SemSym {

    private IdNode structType; 
    
    public StructSym(IdNode id) {
        super("StructSym");
        structType = id;
    }

    public IdNode getStructType() {
        return structType;
    }    
}
