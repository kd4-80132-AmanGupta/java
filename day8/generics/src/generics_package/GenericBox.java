package generics_package;

public class GenericBox<TYPE>{
	
		private TYPE data;
		public void set(TYPE val) {
			this.data = val;
		}
		public TYPE get() {
			return this.data;
		}
	}

}
