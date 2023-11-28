package com.lazyengineer.playwright.test.generated

import com.lazyengineer.playwright.test.extensions.applyFailurePreprocessing
import com.microsoft.playwright.ElementHandle
import com.microsoft.playwright.JSHandle
import com.microsoft.playwright.Locator
import com.microsoft.playwright.impl.CustomLocatorImpl
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

public open class GeneratedLocatorImpl(
  locator: Locator,
) : CustomLocatorImpl(locator) {
  public open fun blur(timeout: Double? = null) {
    val options = Locator.BlurOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            super.blur(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun boundingBox(timeout: Double? = null): BoundingBox {
    val options = Locator.BoundingBoxOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.boundingBox(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun check(
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
                    try {
            super.check(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun clear(
    force: Boolean? = null,
    noWaitAfter: Boolean? = null,
    timeout: Double? = null,
  ) {
    val options = Locator.ClearOptions().apply {
                        this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
                    }
                    try {
            super.clear(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun click(
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
                    try {
            super.click(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun dblclick(
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
                    try {
            super.dblclick(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun dispatchEvent(
    type: String?,
    eventInit: Any?,
    timeout: Double? = null,
  ) {
    val options = Locator.DispatchEventOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            super.dispatchEvent(type, eventInit, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun dragTo(
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
                    try {
            super.dragTo(target, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun elementHandle(timeout: Double? = null): ElementHandle {
    val options = Locator.ElementHandleOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.elementHandle(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun evaluate(
    expression: String?,
    arg: Any?,
    timeout: Double? = null,
  ): Any {
    val options = Locator.EvaluateOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.evaluate(expression, arg, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun evaluateHandle(
    expression: String?,
    arg: Any?,
    timeout: Double? = null,
  ): JSHandle {
    val options = Locator.EvaluateHandleOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.evaluateHandle(expression, arg, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun fill(
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
                    try {
            super.fill(value, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun filter(
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
                    try {
            return super.filter(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun focus(timeout: Double? = null) {
    val options = Locator.FocusOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            super.focus(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getAttribute(name: String?, timeout: Double? = null): String {
    val options = Locator.GetAttributeOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.getAttribute(name, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByAltText(text: String?, exact: Boolean? = null): Locator {
    val options = Locator.GetByAltTextOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByAltText(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByAltText(text: Pattern?, exact: Boolean? = null): Locator {
    val options = Locator.GetByAltTextOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByAltText(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByLabel(text: String?, exact: Boolean? = null): Locator {
    val options = Locator.GetByLabelOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByLabel(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByLabel(text: Pattern?, exact: Boolean? = null): Locator {
    val options = Locator.GetByLabelOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByLabel(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByPlaceholder(text: String?, exact: Boolean? = null): Locator {
    val options = Locator.GetByPlaceholderOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByPlaceholder(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByPlaceholder(text: Pattern?, exact: Boolean? = null): Locator {
    val options = Locator.GetByPlaceholderOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByPlaceholder(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByRole(
    role: AriaRole?,
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    try {
            return super.getByRole(role, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByText(text: String?, exact: Boolean? = null): Locator {
    val options = Locator.GetByTextOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByText(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByText(text: Pattern?, exact: Boolean? = null): Locator {
    val options = Locator.GetByTextOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByText(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByTitle(text: String?, exact: Boolean? = null): Locator {
    val options = Locator.GetByTitleOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByTitle(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getByTitle(text: Pattern?, exact: Boolean? = null): Locator {
    val options = Locator.GetByTitleOptions().apply {
                        this.exact = exact
                    }
                    try {
            return super.getByTitle(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun hover(
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
                    try {
            super.hover(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun innerHTML(timeout: Double? = null): String {
    val options = Locator.InnerHTMLOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.innerHTML(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun innerText(timeout: Double? = null): String {
    val options = Locator.InnerTextOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.innerText(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun inputValue(timeout: Double? = null): String {
    val options = Locator.InputValueOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.inputValue(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun isChecked(timeout: Double? = null): Boolean {
    val options = Locator.IsCheckedOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.isChecked(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun isDisabled(timeout: Double? = null): Boolean {
    val options = Locator.IsDisabledOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.isDisabled(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun isEditable(timeout: Double? = null): Boolean {
    val options = Locator.IsEditableOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.isEditable(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun isEnabled(timeout: Double? = null): Boolean {
    val options = Locator.IsEnabledOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.isEnabled(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun isHidden(timeout: Double? = null): Boolean {
    val options = Locator.IsHiddenOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.isHidden(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun isVisible(timeout: Double? = null): Boolean {
    val options = Locator.IsVisibleOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.isVisible(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun locator(
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
                    try {
            return super.locator(selector, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun locator(
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
                    try {
            return super.locator(selectorOrLocator, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun press(
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
                    try {
            super.press(key, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun screenshot(
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
                    try {
            return super.screenshot(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun scrollIntoViewIfNeeded(timeout: Double? = null) {
    val options = Locator.ScrollIntoViewIfNeededOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            super.scrollIntoViewIfNeeded(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectOption(
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
                    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectOption(
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
                    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectOption(
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
                    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectOption(
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
                    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectOption(
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
                    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectOption(
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
                    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun selectText(force: Boolean? = null, timeout: Double? = null) {
    val options = Locator.SelectTextOptions().apply {
                        this.force = force
            this.timeout = timeout
                    }
                    try {
            super.selectText(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun setChecked(
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
                    try {
            super.setChecked(checked, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun setInputFiles(
    files: Path?,
    noWaitAfter: Boolean? = null,
    timeout: Double? = null,
  ) {
    val options = Locator.SetInputFilesOptions().apply {
                        this.noWaitAfter = noWaitAfter
            this.timeout = timeout
                    }
                    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun setInputFiles(
    files: Array<out Path>?,
    noWaitAfter: Boolean? = null,
    timeout: Double? = null,
  ) {
    val options = Locator.SetInputFilesOptions().apply {
                        this.noWaitAfter = noWaitAfter
            this.timeout = timeout
                    }
                    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun setInputFiles(
    files: FilePayload?,
    noWaitAfter: Boolean? = null,
    timeout: Double? = null,
  ) {
    val options = Locator.SetInputFilesOptions().apply {
                        this.noWaitAfter = noWaitAfter
            this.timeout = timeout
                    }
                    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun setInputFiles(
    files: Array<out FilePayload>?,
    noWaitAfter: Boolean? = null,
    timeout: Double? = null,
  ) {
    val options = Locator.SetInputFilesOptions().apply {
                        this.noWaitAfter = noWaitAfter
            this.timeout = timeout
                    }
                    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun tap(
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
                    try {
            super.tap(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun textContent(timeout: Double? = null): String {
    val options = Locator.TextContentOptions().apply {
                        this.timeout = timeout
                    }
                    try {
            return super.textContent(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun type(
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
                    try {
            super.type(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun uncheck(
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
                    try {
            super.uncheck(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun waitFor(state: WaitForSelectorState? = null, timeout: Double? = null) {
    val options = Locator.WaitForOptions().apply {
                        this.state = state
            this.timeout = timeout
                    }
                    try {
            super.waitFor(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  public open fun getAriaAlert(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.ALERT, options)

  }

  public open fun getAriaAlertdialog(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.ALERTDIALOG, options)

  }

  public open fun getAriaApplication(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.APPLICATION, options)

  }

  public open fun getAriaArticle(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.ARTICLE, options)

  }

  public open fun getAriaBanner(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.BANNER, options)

  }

  public open fun getAriaBlockquote(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.BLOCKQUOTE, options)

  }

  public open fun getAriaButton(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.BUTTON, options)

  }

  public open fun getAriaCaption(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.CAPTION, options)

  }

  public open fun getAriaCell(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.CELL, options)

  }

  public open fun getAriaCheckbox(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.CHECKBOX, options)

  }

  public open fun getAriaCode(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.CODE, options)

  }

  public open fun getAriaColumnheader(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.COLUMNHEADER, options)

  }

  public open fun getAriaCombobox(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.COMBOBOX, options)

  }

  public open fun getAriaComplementary(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.COMPLEMENTARY, options)

  }

  public open fun getAriaContentinfo(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.CONTENTINFO, options)

  }

  public open fun getAriaDefinition(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.DEFINITION, options)

  }

  public open fun getAriaDeletion(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.DELETION, options)

  }

  public open fun getAriaDialog(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.DIALOG, options)

  }

  public open fun getAriaDirectory(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.DIRECTORY, options)

  }

  public open fun getAriaDocument(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.DOCUMENT, options)

  }

  public open fun getAriaEmphasis(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.EMPHASIS, options)

  }

  public open fun getAriaFeed(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.FEED, options)

  }

  public open fun getAriaFigure(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.FIGURE, options)

  }

  public open fun getAriaForm(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.FORM, options)

  }

  public open fun getAriaGeneric(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.GENERIC, options)

  }

  public open fun getAriaGrid(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.GRID, options)

  }

  public open fun getAriaGridcell(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.GRIDCELL, options)

  }

  public open fun getAriaGroup(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.GROUP, options)

  }

  public open fun getAriaHeading(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.HEADING, options)

  }

  public open fun getAriaImg(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.IMG, options)

  }

  public open fun getAriaInsertion(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.INSERTION, options)

  }

  public open fun getAriaLink(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.LINK, options)

  }

  public open fun getAriaList(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.LIST, options)

  }

  public open fun getAriaListbox(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.LISTBOX, options)

  }

  public open fun getAriaListitem(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.LISTITEM, options)

  }

  public open fun getAriaLog(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.LOG, options)

  }

  public open fun getAriaMain(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MAIN, options)

  }

  public open fun getAriaMarquee(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MARQUEE, options)

  }

  public open fun getAriaMath(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MATH, options)

  }

  public open fun getAriaMeter(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.METER, options)

  }

  public open fun getAriaMenu(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MENU, options)

  }

  public open fun getAriaMenubar(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MENUBAR, options)

  }

  public open fun getAriaMenuitem(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MENUITEM, options)

  }

  public open fun getAriaMenuitemcheckbox(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MENUITEMCHECKBOX, options)

  }

  public open fun getAriaMenuitemradio(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.MENUITEMRADIO, options)

  }

  public open fun getAriaNavigation(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.NAVIGATION, options)

  }

  public open fun getAriaNone(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.NONE, options)

  }

  public open fun getAriaNote(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.NOTE, options)

  }

  public open fun getAriaOption(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.OPTION, options)

  }

  public open fun getAriaParagraph(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.PARAGRAPH, options)

  }

  public open fun getAriaPresentation(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.PRESENTATION, options)

  }

  public open fun getAriaProgressbar(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.PROGRESSBAR, options)

  }

  public open fun getAriaRadio(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.RADIO, options)

  }

  public open fun getAriaRadiogroup(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.RADIOGROUP, options)

  }

  public open fun getAriaRegion(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.REGION, options)

  }

  public open fun getAriaRow(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.ROW, options)

  }

  public open fun getAriaRowgroup(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.ROWGROUP, options)

  }

  public open fun getAriaRowheader(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.ROWHEADER, options)

  }

  public open fun getAriaScrollbar(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SCROLLBAR, options)

  }

  public open fun getAriaSearch(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SEARCH, options)

  }

  public open fun getAriaSearchbox(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SEARCHBOX, options)

  }

  public open fun getAriaSeparator(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SEPARATOR, options)

  }

  public open fun getAriaSlider(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SLIDER, options)

  }

  public open fun getAriaSpinbutton(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SPINBUTTON, options)

  }

  public open fun getAriaStatus(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.STATUS, options)

  }

  public open fun getAriaStrong(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.STRONG, options)

  }

  public open fun getAriaSubscript(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SUBSCRIPT, options)

  }

  public open fun getAriaSuperscript(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SUPERSCRIPT, options)

  }

  public open fun getAriaSwitch(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.SWITCH, options)

  }

  public open fun getAriaTab(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TAB, options)

  }

  public open fun getAriaTable(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TABLE, options)

  }

  public open fun getAriaTablist(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TABLIST, options)

  }

  public open fun getAriaTabpanel(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TABPANEL, options)

  }

  public open fun getAriaTerm(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TERM, options)

  }

  public open fun getAriaTextbox(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TEXTBOX, options)

  }

  public open fun getAriaTime(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TIME, options)

  }

  public open fun getAriaTimer(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TIMER, options)

  }

  public open fun getAriaToolbar(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TOOLBAR, options)

  }

  public open fun getAriaTooltip(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TOOLTIP, options)

  }

  public open fun getAriaTree(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TREE, options)

  }

  public open fun getAriaTreegrid(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TREEGRID, options)

  }

  public open fun getAriaTreeitem(
    checked: Boolean? = null,
    disabled: Boolean? = null,
    expanded: Boolean? = null,
    includeHidden: Boolean? = null,
    level: Int? = null,
    pressed: Boolean? = null,
    selected: Boolean? = null,
    containsName: String? = null,
    exactName: String? = null,
    regexName: Regex? = null,
  ): Locator {
    val options = Locator.GetByRoleOptions().apply {
                        this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected
            
            if (exactName != null) {
            this.exact = true
            this.name = exactName
        } else if (regexName != null){
            this.name = regexName.toPattern()
        } else {
            this.name = containsName
        }
            
                    }
                    return super.getByRole(AriaRole.TREEITEM, options)

  }

  public open fun getAriaAlert(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.ALERT, options)

  public open fun getAriaAlertdialog(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.ALERTDIALOG, options)

  public open fun getAriaApplication(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.APPLICATION, options)

  public open fun getAriaArticle(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.ARTICLE, options)

  public open fun getAriaBanner(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.BANNER, options)

  public open fun getAriaBlockquote(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.BLOCKQUOTE, options)

  public open fun getAriaButton(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.BUTTON, options)

  public open fun getAriaCaption(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.CAPTION, options)

  public open fun getAriaCell(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.CELL, options)

  public open fun getAriaCheckbox(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.CHECKBOX, options)

  public open fun getAriaCode(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.CODE, options)

  public open fun getAriaColumnheader(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.COLUMNHEADER, options)

  public open fun getAriaCombobox(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.COMBOBOX, options)

  public open fun getAriaComplementary(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.COMPLEMENTARY, options)

  public open fun getAriaContentinfo(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.CONTENTINFO, options)

  public open fun getAriaDefinition(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.DEFINITION, options)

  public open fun getAriaDeletion(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.DELETION, options)

  public open fun getAriaDialog(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.DIALOG, options)

  public open fun getAriaDirectory(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.DIRECTORY, options)

  public open fun getAriaDocument(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.DOCUMENT, options)

  public open fun getAriaEmphasis(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.EMPHASIS, options)

  public open fun getAriaFeed(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.FEED, options)

  public open fun getAriaFigure(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.FIGURE, options)

  public open fun getAriaForm(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.FORM, options)

  public open fun getAriaGeneric(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.GENERIC, options)

  public open fun getAriaGrid(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.GRID, options)

  public open fun getAriaGridcell(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.GRIDCELL, options)

  public open fun getAriaGroup(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.GROUP, options)

  public open fun getAriaHeading(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.HEADING, options)

  public open fun getAriaImg(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.IMG, options)

  public open fun getAriaInsertion(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.INSERTION, options)

  public open fun getAriaLink(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.LINK, options)

  public open fun getAriaList(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.LIST, options)

  public open fun getAriaListbox(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.LISTBOX, options)

  public open fun getAriaListitem(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.LISTITEM, options)

  public open fun getAriaLog(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.LOG, options)

  public open fun getAriaMain(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MAIN, options)

  public open fun getAriaMarquee(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MARQUEE, options)

  public open fun getAriaMath(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MATH, options)

  public open fun getAriaMeter(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.METER, options)

  public open fun getAriaMenu(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MENU, options)

  public open fun getAriaMenubar(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MENUBAR, options)

  public open fun getAriaMenuitem(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MENUITEM, options)

  public open fun getAriaMenuitemcheckbox(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MENUITEMCHECKBOX, options)

  public open fun getAriaMenuitemradio(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.MENUITEMRADIO, options)

  public open fun getAriaNavigation(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.NAVIGATION, options)

  public open fun getAriaNone(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.NONE, options)

  public open fun getAriaNote(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.NOTE, options)

  public open fun getAriaOption(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.OPTION, options)

  public open fun getAriaParagraph(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.PARAGRAPH, options)

  public open fun getAriaPresentation(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.PRESENTATION, options)

  public open fun getAriaProgressbar(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.PROGRESSBAR, options)

  public open fun getAriaRadio(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.RADIO, options)

  public open fun getAriaRadiogroup(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.RADIOGROUP, options)

  public open fun getAriaRegion(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.REGION, options)

  public open fun getAriaRow(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.ROW, options)

  public open fun getAriaRowgroup(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.ROWGROUP, options)

  public open fun getAriaRowheader(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.ROWHEADER, options)

  public open fun getAriaScrollbar(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SCROLLBAR, options)

  public open fun getAriaSearch(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SEARCH, options)

  public open fun getAriaSearchbox(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SEARCHBOX, options)

  public open fun getAriaSeparator(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SEPARATOR, options)

  public open fun getAriaSlider(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SLIDER, options)

  public open fun getAriaSpinbutton(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SPINBUTTON, options)

  public open fun getAriaStatus(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.STATUS, options)

  public open fun getAriaStrong(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.STRONG, options)

  public open fun getAriaSubscript(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SUBSCRIPT, options)

  public open fun getAriaSuperscript(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SUPERSCRIPT, options)

  public open fun getAriaSwitch(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.SWITCH, options)

  public open fun getAriaTab(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TAB, options)

  public open fun getAriaTable(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TABLE, options)

  public open fun getAriaTablist(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TABLIST, options)

  public open fun getAriaTabpanel(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TABPANEL, options)

  public open fun getAriaTerm(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TERM, options)

  public open fun getAriaTextbox(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TEXTBOX, options)

  public open fun getAriaTime(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TIME, options)

  public open fun getAriaTimer(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TIMER, options)

  public open fun getAriaToolbar(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TOOLBAR, options)

  public open fun getAriaTooltip(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TOOLTIP, options)

  public open fun getAriaTree(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TREE, options)

  public open fun getAriaTreegrid(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TREEGRID, options)

  public open fun getAriaTreeitem(options: Locator.GetByRoleOptions?): Locator =
      super.getByRole(AriaRole.TREEITEM, options)
}
