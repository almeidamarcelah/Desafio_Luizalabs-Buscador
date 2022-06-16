package search.enums;

public enum MessageEnum {

		PARAMETRO_INVALIDO("Parametro não informado"),
		
		PATH_INVALIDO("Caminho informado invalido");

		private String message;

		MessageEnum(String message) {
			this.setMessage(message);
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
}
