class StructDefSym extends SemSym {
    // new fields
    private SymTable symTab;
    
    public StructDefSym(SymTable table) {
        super("StructDef");
        symTab = table;
    }

    public SymTable getSymTable() {
        return symTab;
    }
}
