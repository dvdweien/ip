class ToDo extends Task {

	ToDo(String s) {
		super(s);
	}

	ToDo(String s, boolean b) {
		super(s, b);
		//System.out.println(this.toString());
	}

	@Override
	String saveName() {
		return String.format("todo1!1%s1!1%b", super.getName(), super.getIsDone());
	}

	@Override
	public String toString() {
		return String.format("[T]%s", super.toString());
	}
}
