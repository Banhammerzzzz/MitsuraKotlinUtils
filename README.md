# MitsuraKotlinUtils

# v1.0.3
## JSONObject

```
getStringDefault(key)
```
returns string by key, or empty if no data or data is null

same for
```
getIntDefault(key: String) 0
getFloatDefault(key: String) 0
getDoubleDefault(key: String) 0
getBooleanDefault(key: String) false
getLongDefault(key: String) 0L
getJSONObjectDefault(key: String) null
getJSONArrayDefault(key: String) null
```

# v1.0.2

## AppCompatActivity

```
hideKeyboard()
```
```
showFragmentIn(fragment: Fragment, @IdRes viewGroup: Int)
```

## ArrayList
```
List<T>.findClosestTo(value: Float, predicate: (T) -> Float): T?
```
```
List<T>.findClosestToInSortedList(value: Float, predicate: (T) -> Float): T?
```
copies list, sorts it, then calls List<T>.findClosestTo(value: Float, predicate: (T) -> Float): T?

## Context
```
animateLayout(layout: ConstraintLayout, @LayoutRes to: Int)
```
animates existing constraint's nodes into new layout

```
fromDPToPX(@DimenRes res: Int): Int = resources.getDimension(res).toInt()
```
when you need dp from context for some reason

## Number

```
DpToPx()
```

## Paint

```
getRectForTextWith(text: String, width: Float, height: Float, shrinkCoef: Float = 0.8f): Rect
```
```
getTextBounds(text: String, rect: Rect)
```
because you dont need text bounds for part of the text

## ViewGroup

```
forEachChild(predicate: (View)
```
goes thru each child (out View) inside itself and calls predicate over them

```
forEachChildViewRec(predicate: (View) -> Unit)
```
goes thru each child (out View) inside itself and call predicate over them, when child is ViewGroup- calls forEachChildViewRec on it

```
hideKeyboardWhenClick() 
```
hides keyboard(when context is AppCompatActivity)

