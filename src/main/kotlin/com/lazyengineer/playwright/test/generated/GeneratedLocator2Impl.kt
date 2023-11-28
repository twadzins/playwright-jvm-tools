package com.lazyengineer.playwright.test.generated

import com.lazyengineer.playwright.poet.baseextensions.BaseExtensions.clickByRole
import com.lazyengineer.playwright.poet.baseextensions.BaseExtensions.clickByText
import com.microsoft.playwright.ElementHandle
import com.microsoft.playwright.JSHandle
import com.microsoft.playwright.Locator
import com.microsoft.playwright.options.AriaRole
import com.microsoft.playwright.options.BoundingBox
import com.microsoft.playwright.options.FilePayload
import com.microsoft.playwright.options.KeyboardModifier
import com.microsoft.playwright.options.MouseButton
import com.microsoft.playwright.options.Position
import com.microsoft.playwright.options.ScreenshotAnimations
import com.microsoft.playwright.options.ScreenshotCaret
import com.microsoft.playwright.options.ScreenshotScale
import com.microsoft.playwright.options.ScreenshotType
import com.microsoft.playwright.options.SelectOption
import com.microsoft.playwright.options.WaitForSelectorState
import java.nio.file.Path
import java.util.regex.Pattern

public fun Locator.blur(timeout: Double? = null) {
  val options = Locator.BlurOptions().apply {
                      this.timeout = timeout
                  }
                  this.blur(options)
}

public fun Locator.boundingBox(timeout: Double? = null): BoundingBox {
  val options = Locator.BoundingBoxOptions().apply {
                      this.timeout = timeout
                  }
                  return this.boundingBox(options)
}

public fun Locator.check(
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.CheckOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.check(options)
}

public fun Locator.clear(
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.ClearOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.clear(options)
}

public fun Locator.click(
  button: MouseButton? = null,
  clickCount: Int? = null,
  delay: Double? = null,
  force: Boolean? = null,
  modifiers: List<KeyboardModifier>? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.ClickOptions().apply {
                      this.button = button
          this.clickCount = clickCount
          this.delay = delay
          this.force = force
          this.modifiers = modifiers
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.click(options)
}

public fun Locator.dblclick(
  button: MouseButton? = null,
  delay: Double? = null,
  force: Boolean? = null,
  modifiers: List<KeyboardModifier>? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.DblclickOptions().apply {
                      this.button = button
          this.delay = delay
          this.force = force
          this.modifiers = modifiers
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.dblclick(options)
}

public fun Locator.dispatchEvent(
  type: String?,
  eventInit: Any?,
  timeout: Double? = null,
) {
  val options = Locator.DispatchEventOptions().apply {
                      this.timeout = timeout
                  }
                  this.dispatchEvent(type, eventInit, options)
}

public fun Locator.dragTo(
  target: Locator?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  sourcePosition: Position? = null,
  targetPosition: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.DragToOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.sourcePosition = sourcePosition
          this.targetPosition = targetPosition
          this.timeout = timeout
          this.trial = trial
                  }
                  this.dragTo(target, options)
}

public fun Locator.elementHandle(timeout: Double? = null): ElementHandle {
  val options = Locator.ElementHandleOptions().apply {
                      this.timeout = timeout
                  }
                  return this.elementHandle(options)
}

public fun Locator.evaluate(
  expression: String?,
  arg: Any?,
  timeout: Double? = null,
): Any {
  val options = Locator.EvaluateOptions().apply {
                      this.timeout = timeout
                  }
                  return this.evaluate(expression, arg, options)
}

public fun Locator.evaluateHandle(
  expression: String?,
  arg: Any?,
  timeout: Double? = null,
): JSHandle {
  val options = Locator.EvaluateHandleOptions().apply {
                      this.timeout = timeout
                  }
                  return this.evaluateHandle(expression, arg, options)
}

public fun Locator.fill(
  `value`: String?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.FillOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.fill(value, options)
}

public fun Locator.filter(
  has: Locator? = null,
  hasNot: Locator? = null,
  hasNotText: Any? = null,
  hasText: Any? = null,
): Locator {
  val options = Locator.FilterOptions().apply {
                      this.has = has
          this.hasNot = hasNot
          this.hasNotText = hasNotText
          this.hasText = hasText
                  }
                  return this.filter(options)
}

public fun Locator.focus(timeout: Double? = null) {
  val options = Locator.FocusOptions().apply {
                      this.timeout = timeout
                  }
                  this.focus(options)
}

public fun Locator.getAttribute(name: String?, timeout: Double? = null): String {
  val options = Locator.GetAttributeOptions().apply {
                      this.timeout = timeout
                  }
                  return this.getAttribute(name, options)
}

public fun Locator.getByAltText(text: String?, exact: Boolean? = null): Locator {
  val options = Locator.GetByAltTextOptions().apply {
                      this.exact = exact
                  }
                  return this.getByAltText(text, options)
}

public fun Locator.getByAltText(text: Pattern?, exact: Boolean? = null): Locator {
  val options = Locator.GetByAltTextOptions().apply {
                      this.exact = exact
                  }
                  return this.getByAltText(text, options)
}

public fun Locator.getByLabel(text: String?, exact: Boolean? = null): Locator {
  val options = Locator.GetByLabelOptions().apply {
                      this.exact = exact
                  }
                  return this.getByLabel(text, options)
}

public fun Locator.getByLabel(text: Pattern?, exact: Boolean? = null): Locator {
  val options = Locator.GetByLabelOptions().apply {
                      this.exact = exact
                  }
                  return this.getByLabel(text, options)
}

public fun Locator.getByPlaceholder(text: String?, exact: Boolean? = null): Locator {
  val options = Locator.GetByPlaceholderOptions().apply {
                      this.exact = exact
                  }
                  return this.getByPlaceholder(text, options)
}

public fun Locator.getByPlaceholder(text: Pattern?, exact: Boolean? = null): Locator {
  val options = Locator.GetByPlaceholderOptions().apply {
                      this.exact = exact
                  }
                  return this.getByPlaceholder(text, options)
}

public fun Locator.getByRole(
  role: AriaRole?,
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(role, options)
}

public fun Locator.getByText(text: String?, exact: Boolean? = null): Locator {
  val options = Locator.GetByTextOptions().apply {
                      this.exact = exact
                  }
                  return this.getByText(text, options)
}

public fun Locator.getByText(text: Pattern?, exact: Boolean? = null): Locator {
  val options = Locator.GetByTextOptions().apply {
                      this.exact = exact
                  }
                  return this.getByText(text, options)
}

public fun Locator.getByTitle(text: String?, exact: Boolean? = null): Locator {
  val options = Locator.GetByTitleOptions().apply {
                      this.exact = exact
                  }
                  return this.getByTitle(text, options)
}

public fun Locator.getByTitle(text: Pattern?, exact: Boolean? = null): Locator {
  val options = Locator.GetByTitleOptions().apply {
                      this.exact = exact
                  }
                  return this.getByTitle(text, options)
}

public fun Locator.hover(
  force: Boolean? = null,
  modifiers: List<KeyboardModifier>? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.HoverOptions().apply {
                      this.force = force
          this.modifiers = modifiers
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.hover(options)
}

public fun Locator.innerHTML(timeout: Double? = null): String {
  val options = Locator.InnerHTMLOptions().apply {
                      this.timeout = timeout
                  }
                  return this.innerHTML(options)
}

public fun Locator.innerText(timeout: Double? = null): String {
  val options = Locator.InnerTextOptions().apply {
                      this.timeout = timeout
                  }
                  return this.innerText(options)
}

public fun Locator.inputValue(timeout: Double? = null): String {
  val options = Locator.InputValueOptions().apply {
                      this.timeout = timeout
                  }
                  return this.inputValue(options)
}

public fun Locator.isChecked(timeout: Double? = null): Boolean {
  val options = Locator.IsCheckedOptions().apply {
                      this.timeout = timeout
                  }
                  return this.isChecked(options)
}

public fun Locator.isDisabled(timeout: Double? = null): Boolean {
  val options = Locator.IsDisabledOptions().apply {
                      this.timeout = timeout
                  }
                  return this.isDisabled(options)
}

public fun Locator.isEditable(timeout: Double? = null): Boolean {
  val options = Locator.IsEditableOptions().apply {
                      this.timeout = timeout
                  }
                  return this.isEditable(options)
}

public fun Locator.isEnabled(timeout: Double? = null): Boolean {
  val options = Locator.IsEnabledOptions().apply {
                      this.timeout = timeout
                  }
                  return this.isEnabled(options)
}

public fun Locator.isHidden(timeout: Double? = null): Boolean {
  val options = Locator.IsHiddenOptions().apply {
                      this.timeout = timeout
                  }
                  return this.isHidden(options)
}

public fun Locator.isVisible(timeout: Double? = null): Boolean {
  val options = Locator.IsVisibleOptions().apply {
                      this.timeout = timeout
                  }
                  return this.isVisible(options)
}

public fun Locator.locator(
  selector: String?,
  has: Locator? = null,
  hasNot: Locator? = null,
  hasNotText: Any? = null,
  hasText: Any? = null,
): Locator {
  val options = Locator.LocatorOptions().apply {
                      this.has = has
          this.hasNot = hasNot
          this.hasNotText = hasNotText
          this.hasText = hasText
                  }
                  return this.locator(selector, options)
}

public fun Locator.locator(
  selectorOrLocator: Locator?,
  has: Locator? = null,
  hasNot: Locator? = null,
  hasNotText: Any? = null,
  hasText: Any? = null,
): Locator {
  val options = Locator.LocatorOptions().apply {
                      this.has = has
          this.hasNot = hasNot
          this.hasNotText = hasNotText
          this.hasText = hasText
                  }
                  return this.locator(selectorOrLocator, options)
}

public fun Locator.press(
  key: String?,
  delay: Double? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.PressOptions().apply {
                      this.delay = delay
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.press(key, options)
}

public fun Locator.screenshot(
  animations: ScreenshotAnimations? = null,
  caret: ScreenshotCaret? = null,
  mask: List<Locator>? = null,
  maskColor: String? = null,
  omitBackground: Boolean? = null,
  path: Path? = null,
  quality: Int? = null,
  scale: ScreenshotScale? = null,
  timeout: Double? = null,
  type: ScreenshotType? = null,
): ByteArray {
  val options = Locator.ScreenshotOptions().apply {
                      this.animations = animations
          this.caret = caret
          this.mask = mask
          this.maskColor = maskColor
          this.omitBackground = omitBackground
          this.path = path
          this.quality = quality
          this.scale = scale
          this.timeout = timeout
          this.type = type
                  }
                  return this.screenshot(options)
}

public fun Locator.scrollIntoViewIfNeeded(timeout: Double? = null) {
  val options = Locator.ScrollIntoViewIfNeededOptions().apply {
                      this.timeout = timeout
                  }
                  this.scrollIntoViewIfNeeded(options)
}

public fun Locator.selectOption(
  values: String?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
): MutableList<String> {
  val options = Locator.SelectOptionOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  return this.selectOption(values, options)
}

public fun Locator.selectOption(
  values: ElementHandle?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
): MutableList<String> {
  val options = Locator.SelectOptionOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  return this.selectOption(values, options)
}

public fun Locator.selectOption(
  values: Array<out String>?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
): MutableList<String> {
  val options = Locator.SelectOptionOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  return this.selectOption(values, options)
}

public fun Locator.selectOption(
  values: SelectOption?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
): MutableList<String> {
  val options = Locator.SelectOptionOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  return this.selectOption(values, options)
}

public fun Locator.selectOption(
  values: Array<out ElementHandle>?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
): MutableList<String> {
  val options = Locator.SelectOptionOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  return this.selectOption(values, options)
}

public fun Locator.selectOption(
  values: Array<out SelectOption>?,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
): MutableList<String> {
  val options = Locator.SelectOptionOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  return this.selectOption(values, options)
}

public fun Locator.selectText(force: Boolean? = null, timeout: Double? = null) {
  val options = Locator.SelectTextOptions().apply {
                      this.force = force
          this.timeout = timeout
                  }
                  this.selectText(options)
}

public fun Locator.setChecked(
  checked: Boolean,
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.SetCheckedOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.setChecked(checked, options)
}

public fun Locator.setInputFiles(
  files: Path?,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.SetInputFilesOptions().apply {
                      this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.setInputFiles(files, options)
}

public fun Locator.setInputFiles(
  files: Array<out Path>?,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.SetInputFilesOptions().apply {
                      this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.setInputFiles(files, options)
}

public fun Locator.setInputFiles(
  files: FilePayload?,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.SetInputFilesOptions().apply {
                      this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.setInputFiles(files, options)
}

public fun Locator.setInputFiles(
  files: Array<out FilePayload>?,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.SetInputFilesOptions().apply {
                      this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.setInputFiles(files, options)
}

public fun Locator.tap(
  force: Boolean? = null,
  modifiers: List<KeyboardModifier>? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.TapOptions().apply {
                      this.force = force
          this.modifiers = modifiers
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.tap(options)
}

public fun Locator.textContent(timeout: Double? = null): String {
  val options = Locator.TextContentOptions().apply {
                      this.timeout = timeout
                  }
                  return this.textContent(options)
}

public fun Locator.type(
  text: String?,
  delay: Double? = null,
  noWaitAfter: Boolean? = null,
  timeout: Double? = null,
) {
  val options = Locator.TypeOptions().apply {
                      this.delay = delay
          this.noWaitAfter = noWaitAfter
          this.timeout = timeout
                  }
                  this.type(text, options)
}

public fun Locator.uncheck(
  force: Boolean? = null,
  noWaitAfter: Boolean? = null,
  position: Position? = null,
  timeout: Double? = null,
  trial: Boolean? = null,
) {
  val options = Locator.UncheckOptions().apply {
                      this.force = force
          this.noWaitAfter = noWaitAfter
          this.position = position
          this.timeout = timeout
          this.trial = trial
                  }
                  this.uncheck(options)
}

public fun Locator.waitFor(state: WaitForSelectorState? = null, timeout: Double? = null) {
  val options = Locator.WaitForOptions().apply {
                      this.state = state
          this.timeout = timeout
                  }
                  this.waitFor(options)
}

public fun Locator.getAriaAlert(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.ALERT, options)

}

public fun Locator.getAriaAlertdialog(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.ALERTDIALOG, options)

}

public fun Locator.getAriaApplication(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.APPLICATION, options)

}

public fun Locator.getAriaArticle(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.ARTICLE, options)

}

public fun Locator.getAriaBanner(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.BANNER, options)

}

public fun Locator.getAriaBlockquote(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.BLOCKQUOTE, options)

}

public fun Locator.getAriaButton(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.BUTTON, options)

}

public fun Locator.getAriaCaption(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.CAPTION, options)

}

public fun Locator.getAriaCell(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.CELL, options)

}

public fun Locator.getAriaCheckbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.CHECKBOX, options)

}

public fun Locator.getAriaCode(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.CODE, options)

}

public fun Locator.getAriaColumnheader(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.COLUMNHEADER, options)

}

public fun Locator.getAriaCombobox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.COMBOBOX, options)

}

public fun Locator.getAriaComplementary(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.COMPLEMENTARY, options)

}

public fun Locator.getAriaContentinfo(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.CONTENTINFO, options)

}

public fun Locator.getAriaDefinition(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.DEFINITION, options)

}

public fun Locator.getAriaDeletion(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.DELETION, options)

}

public fun Locator.getAriaDialog(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.DIALOG, options)

}

public fun Locator.getAriaDirectory(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.DIRECTORY, options)

}

public fun Locator.getAriaDocument(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.DOCUMENT, options)

}

public fun Locator.getAriaEmphasis(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.EMPHASIS, options)

}

public fun Locator.getAriaFeed(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.FEED, options)

}

public fun Locator.getAriaFigure(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.FIGURE, options)

}

public fun Locator.getAriaForm(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.FORM, options)

}

public fun Locator.getAriaGeneric(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.GENERIC, options)

}

public fun Locator.getAriaGrid(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.GRID, options)

}

public fun Locator.getAriaGridcell(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.GRIDCELL, options)

}

public fun Locator.getAriaGroup(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.GROUP, options)

}

public fun Locator.getAriaHeading(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.HEADING, options)

}

public fun Locator.getAriaImg(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.IMG, options)

}

public fun Locator.getAriaInsertion(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.INSERTION, options)

}

public fun Locator.getAriaLink(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.LINK, options)

}

public fun Locator.getAriaList(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.LIST, options)

}

public fun Locator.getAriaListbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.LISTBOX, options)

}

public fun Locator.getAriaListitem(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.LISTITEM, options)

}

public fun Locator.getAriaLog(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.LOG, options)

}

public fun Locator.getAriaMain(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MAIN, options)

}

public fun Locator.getAriaMarquee(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MARQUEE, options)

}

public fun Locator.getAriaMath(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MATH, options)

}

public fun Locator.getAriaMeter(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.METER, options)

}

public fun Locator.getAriaMenu(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MENU, options)

}

public fun Locator.getAriaMenubar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MENUBAR, options)

}

public fun Locator.getAriaMenuitem(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MENUITEM, options)

}

public fun Locator.getAriaMenuitemcheckbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MENUITEMCHECKBOX, options)

}

public fun Locator.getAriaMenuitemradio(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.MENUITEMRADIO, options)

}

public fun Locator.getAriaNavigation(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.NAVIGATION, options)

}

public fun Locator.getAriaNone(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.NONE, options)

}

public fun Locator.getAriaNote(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.NOTE, options)

}

public fun Locator.getAriaOption(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.OPTION, options)

}

public fun Locator.getAriaParagraph(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.PARAGRAPH, options)

}

public fun Locator.getAriaPresentation(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.PRESENTATION, options)

}

public fun Locator.getAriaProgressbar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.PROGRESSBAR, options)

}

public fun Locator.getAriaRadio(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.RADIO, options)

}

public fun Locator.getAriaRadiogroup(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.RADIOGROUP, options)

}

public fun Locator.getAriaRegion(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.REGION, options)

}

public fun Locator.getAriaRow(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.ROW, options)

}

public fun Locator.getAriaRowgroup(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.ROWGROUP, options)

}

public fun Locator.getAriaRowheader(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.ROWHEADER, options)

}

public fun Locator.getAriaScrollbar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SCROLLBAR, options)

}

public fun Locator.getAriaSearch(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SEARCH, options)

}

public fun Locator.getAriaSearchbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SEARCHBOX, options)

}

public fun Locator.getAriaSeparator(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SEPARATOR, options)

}

public fun Locator.getAriaSlider(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SLIDER, options)

}

public fun Locator.getAriaSpinbutton(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SPINBUTTON, options)

}

public fun Locator.getAriaStatus(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.STATUS, options)

}

public fun Locator.getAriaStrong(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.STRONG, options)

}

public fun Locator.getAriaSubscript(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SUBSCRIPT, options)

}

public fun Locator.getAriaSuperscript(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SUPERSCRIPT, options)

}

public fun Locator.getAriaSwitch(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.SWITCH, options)

}

public fun Locator.getAriaTab(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TAB, options)

}

public fun Locator.getAriaTable(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TABLE, options)

}

public fun Locator.getAriaTablist(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TABLIST, options)

}

public fun Locator.getAriaTabpanel(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TABPANEL, options)

}

public fun Locator.getAriaTerm(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TERM, options)

}

public fun Locator.getAriaTextbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TEXTBOX, options)

}

public fun Locator.getAriaTime(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TIME, options)

}

public fun Locator.getAriaTimer(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TIMER, options)

}

public fun Locator.getAriaToolbar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TOOLBAR, options)

}

public fun Locator.getAriaTooltip(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TOOLTIP, options)

}

public fun Locator.getAriaTree(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TREE, options)

}

public fun Locator.getAriaTreegrid(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TREEGRID, options)

}

public fun Locator.getAriaTreeitem(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.getByRole(AriaRole.TREEITEM, options)

}

public fun Locator.clickAriaAlert(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.ALERT, options)

}

public fun Locator.clickAriaAlertdialog(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.ALERTDIALOG, options)

}

public fun Locator.clickAriaApplication(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.APPLICATION, options)

}

public fun Locator.clickAriaArticle(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.ARTICLE, options)

}

public fun Locator.clickAriaBanner(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.BANNER, options)

}

public fun Locator.clickAriaBlockquote(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.BLOCKQUOTE, options)

}

public fun Locator.clickAriaButton(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.BUTTON, options)

}

public fun Locator.clickAriaCaption(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.CAPTION, options)

}

public fun Locator.clickAriaCell(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.CELL, options)

}

public fun Locator.clickAriaCheckbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.CHECKBOX, options)

}

public fun Locator.clickAriaCode(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.CODE, options)

}

public fun Locator.clickAriaColumnheader(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.COLUMNHEADER, options)

}

public fun Locator.clickAriaCombobox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.COMBOBOX, options)

}

public fun Locator.clickAriaComplementary(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.COMPLEMENTARY, options)

}

public fun Locator.clickAriaContentinfo(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.CONTENTINFO, options)

}

public fun Locator.clickAriaDefinition(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.DEFINITION, options)

}

public fun Locator.clickAriaDeletion(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.DELETION, options)

}

public fun Locator.clickAriaDialog(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.DIALOG, options)

}

public fun Locator.clickAriaDirectory(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.DIRECTORY, options)

}

public fun Locator.clickAriaDocument(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.DOCUMENT, options)

}

public fun Locator.clickAriaEmphasis(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.EMPHASIS, options)

}

public fun Locator.clickAriaFeed(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.FEED, options)

}

public fun Locator.clickAriaFigure(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.FIGURE, options)

}

public fun Locator.clickAriaForm(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.FORM, options)

}

public fun Locator.clickAriaGeneric(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.GENERIC, options)

}

public fun Locator.clickAriaGrid(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.GRID, options)

}

public fun Locator.clickAriaGridcell(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.GRIDCELL, options)

}

public fun Locator.clickAriaGroup(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.GROUP, options)

}

public fun Locator.clickAriaHeading(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.HEADING, options)

}

public fun Locator.clickAriaImg(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.IMG, options)

}

public fun Locator.clickAriaInsertion(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.INSERTION, options)

}

public fun Locator.clickAriaLink(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.LINK, options)

}

public fun Locator.clickAriaList(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.LIST, options)

}

public fun Locator.clickAriaListbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.LISTBOX, options)

}

public fun Locator.clickAriaListitem(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.LISTITEM, options)

}

public fun Locator.clickAriaLog(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.LOG, options)

}

public fun Locator.clickAriaMain(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MAIN, options)

}

public fun Locator.clickAriaMarquee(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MARQUEE, options)

}

public fun Locator.clickAriaMath(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MATH, options)

}

public fun Locator.clickAriaMeter(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.METER, options)

}

public fun Locator.clickAriaMenu(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MENU, options)

}

public fun Locator.clickAriaMenubar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MENUBAR, options)

}

public fun Locator.clickAriaMenuitem(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MENUITEM, options)

}

public fun Locator.clickAriaMenuitemcheckbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MENUITEMCHECKBOX, options)

}

public fun Locator.clickAriaMenuitemradio(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.MENUITEMRADIO, options)

}

public fun Locator.clickAriaNavigation(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.NAVIGATION, options)

}

public fun Locator.clickAriaNone(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.NONE, options)

}

public fun Locator.clickAriaNote(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.NOTE, options)

}

public fun Locator.clickAriaOption(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.OPTION, options)

}

public fun Locator.clickAriaParagraph(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.PARAGRAPH, options)

}

public fun Locator.clickAriaPresentation(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.PRESENTATION, options)

}

public fun Locator.clickAriaProgressbar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.PROGRESSBAR, options)

}

public fun Locator.clickAriaRadio(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.RADIO, options)

}

public fun Locator.clickAriaRadiogroup(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.RADIOGROUP, options)

}

public fun Locator.clickAriaRegion(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.REGION, options)

}

public fun Locator.clickAriaRow(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.ROW, options)

}

public fun Locator.clickAriaRowgroup(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.ROWGROUP, options)

}

public fun Locator.clickAriaRowheader(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.ROWHEADER, options)

}

public fun Locator.clickAriaScrollbar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SCROLLBAR, options)

}

public fun Locator.clickAriaSearch(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SEARCH, options)

}

public fun Locator.clickAriaSearchbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SEARCHBOX, options)

}

public fun Locator.clickAriaSeparator(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SEPARATOR, options)

}

public fun Locator.clickAriaSlider(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SLIDER, options)

}

public fun Locator.clickAriaSpinbutton(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SPINBUTTON, options)

}

public fun Locator.clickAriaStatus(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.STATUS, options)

}

public fun Locator.clickAriaStrong(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.STRONG, options)

}

public fun Locator.clickAriaSubscript(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SUBSCRIPT, options)

}

public fun Locator.clickAriaSuperscript(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SUPERSCRIPT, options)

}

public fun Locator.clickAriaSwitch(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.SWITCH, options)

}

public fun Locator.clickAriaTab(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TAB, options)

}

public fun Locator.clickAriaTable(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TABLE, options)

}

public fun Locator.clickAriaTablist(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TABLIST, options)

}

public fun Locator.clickAriaTabpanel(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TABPANEL, options)

}

public fun Locator.clickAriaTerm(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TERM, options)

}

public fun Locator.clickAriaTextbox(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TEXTBOX, options)

}

public fun Locator.clickAriaTime(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TIME, options)

}

public fun Locator.clickAriaTimer(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TIMER, options)

}

public fun Locator.clickAriaToolbar(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TOOLBAR, options)

}

public fun Locator.clickAriaTooltip(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TOOLTIP, options)

}

public fun Locator.clickAriaTree(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TREE, options)

}

public fun Locator.clickAriaTreegrid(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TREEGRID, options)

}

public fun Locator.clickAriaTreeitem(
  exactName: String? = null,
  containsName: String? = null,
  regexName: Regex? = null,
  checked: Boolean? = null,
  disabled: Boolean? = null,
  expanded: Boolean? = null,
  includeHidden: Boolean? = null,
  level: Int? = null,
  pressed: Boolean? = null,
  selected: Boolean? = null,
): Locator {
  val options = Locator.GetByRoleOptions().apply {
                      if (exactName != null) {
          this.exact = true
          this.name = exactName
      } else if (regexName != null){
          this.name = regexName.toPattern()
      } else {
          this.name = containsName
      }
          
          
          this.checked = checked
          this.disabled = disabled
          this.expanded = expanded
          this.includeHidden = includeHidden
          this.level = level
          this.pressed = pressed
          this.selected = selected
                  }
                  return this.clickByRole(AriaRole.TREEITEM, options)

}

public fun Locator.clickByText(text: String, exact: Boolean? = null): Locator {
  val options = Locator.GetByTextOptions().apply {
                      this.exact = exact
                  }
                  return this.clickByText(text, options)
}
