# MitsuraKotlinUtils

v1.0.1

AppCompatActivityKt
*hideKeyboard()
*showFragmentIn(fragment: Fragment, @IdRes viewGroup: Int)

ArrayList
*List<T>.findClosestTo(value: Float, predicate: (T) -> Float): T?
*List<T>.findClosestToInSortedList(value: Float, predicate: (T) -> Float): T?
//copies list, sorts it, then calls List<T>.findClosestTo(value: Float, predicate: (T) -> Float): T?

Context
*animateLayout(layout: ConstraintLayout, @LayoutRes to: Int) 
//animates existing constraint's nodes into new layout
*fromDPToPX(@DimenRes res: Int): Int = resources.getDimension(res).toInt()
//when you need dp from context for some reason

Number
*DpToPx()

Paint
*getRectForTextWith(text: String, width: Float, height: Float, shrinkCoef: Float = 0.8f): Rect
*getTextBounds(text: String, rect: Rect)
//because you dont need text bounds for part of the text

ViewGroup
*forEachChild(predicate: (View)
//goes thru each child (out View) inside itself and calls predicate over them
*forEachChildViewRec(predicate: (View) -> Unit)
//goes thru each child (out View) inside itself and each child view group and calls predicate over them
*hideKeyboardWhenClick() 
//hides keyboard(when context is AppCompatActivity)
