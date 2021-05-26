package currying;

import java.util.function.Function;

public class Currying {
	private enum color {red, green, blue};
	private enum size {small, medium, large};
	

	public static void demo() {
		// We are assembling widgets. Each widget has a common structure but has a unique ID string and will be a color and size from the enums defined above.
		// We have curry-ed the widget construction into three functions, each of which accepts one parameter and returns a function that does the rest of the work
		Function<String, Function<size, Function<color, String>>> makeWidget = id -> size -> color -> "Widget" + id + ":" + size.toString() + ":" + color.toString();
		
		Function<size, Function<color, String>> partialWidgetFunction = makeWidget.apply("007");	// Now we have part of a widget
		
		// At this point we have a function called partialWidgetFunction that we can pass around and call when we're ready.
		finalizeWidget(partialWidgetFunction);
		
	}
	/**
	 * Finalize the creation of our widget
	 * @param partialWidgetFunction The function that will do the work finalizing the widget
	 */
	private static void finalizeWidget(Function<size, Function<color, String>> partialWidgetFunction) {

		// ... figure out the size and color, somehow... perhaps read from a file or query a user
		// ...
		size widgetSize = size.small;
		color widgetColor = color.green;

		// Now apply the size and color to finish our partial widget
		String finalWidget = partialWidgetFunction.apply(widgetSize).apply(widgetColor);
				
		System.out.println("The finalized widget is " + finalWidget);
	}
}
 