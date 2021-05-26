package currying;

import java.util.function.Function;

public class Currying {
	private enum color {red, green, blue};
	private enum size {small, medium, large};
	

	public static void demo() {
		// We are assembling widgets. Each widget has a common structure but has a unique ID string and will be a color and size from the enums defined above
		Function<String, Function<size, Function<color, String>>> makeWidget = id -> size -> color -> "Widget" + id + ":" + size.toString() + ":" + color.toString();
		Function<size, Function<color, String>> partialWidget = makeWidget.apply("007");	// Now we have part of a widget
		
		// ... figure out the size and color, somehow... perhaps read from a file or query a user
		// ...
		size widgetSize = size.small;
		color widgetColor = color.green;
		
		
		// Now apply the size and color to finish our partial widget
		String finalWidget = partialWidget.apply(widgetSize).apply(widgetColor);
		System.out.println(finalWidget);
	}
}