String title = "My Web Page";
String text  = "Hello, world";

String html = STR."""
	     <html>
              <head>
                <title>\{title}</title>
              </head>
              <body>
                <p>\{text}</p>
              </body>
            </html>
	    """;

void main() {
	System.out.println(html);
}