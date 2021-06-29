package the.bytecode.club.bytecodeviewer.translation;

/**
 * All of the specific translations strings needed for BCV
 *
 * @author Konloch
 * @since 6/28/2021
 */
public enum Translation
{
	FILE,
	ADD,
	NEW_WORKSPACE,
	RELOAD_RESOURCES,
	RUN,
	COMPILE,
	SAVE_AS_RUNNABLE_JAR,
	SAVE_AS_ZIP,
	SAVE_AS_DEX,
	SAVE_AS_APK,
	DECOMPILE_SAVE_OPENED_CLASSES,
	DECOMPILE_SAVE_ALL_CLASSES,
	RECENT_FILES,
	ABOUT,
	EXIT,
	
	VIEW,
	VISUAL_SETTINGS,
	LANGUAGE,
	WINDOW_THEME,
	TEXT_AREA_THEME,
	FONT_SIZE,
	SHOW_TAB_FILE_IN_TAB_TITLE,
	SIMPLIFY_NAME_IN_TAB_TITLE,
	SYNCHRONIZED_VIEWING,
	SHOW_CLASS_METHODS,
	
	PANE_1,
	PANE_2,
	PANE_3,
	NONE,
	EDITABLE,
	
	SETTINGS,
	COMPILE_ON_SAVE,
	COMPILE_ON_REFRESH,
	REFRESH_ON_VIEW_CHANGE,
	DECODE_APK_RESOURCES,
	APK_CONVERSION,
	UPDATE_CHECK,
	DELETE_UNKNOWN_LIBS,
	FORCE_PURE_ASCII_AS_TEXT,
	SET_PYTHON_27_EXECUTABLE,
	SET_PYTHON_30_EXECUTABLE,
	SET_JRE_RT_LIBRARY,
	SET_OPTIONAL_LIBRARY_FOLDER,
	SET_JAVAC_EXECUTABLE,
	BYTECODE_DECOMPILER,
	DEBUG_HELPERS,
	APPEND_BRACKETS_TO_LABEL,
	
	PLUGINS,
	OPEN_PLUGIN,
	RECENT_PLUGINS,
	CODE_SEQUENCE_DIAGRAM,
	MALICIOUS_CODE_SCANNER,
	SHOW_MAIN_METHODS,
	SHOW_ALL_STRINGS,
	REPLACE_STRINGS,
	STACK_FRAMES_REMOVER,
	ZKM_STRING_DECRYPTER,
	ALLATORI_STRING_DECRYPTER,
	ZSTRINGARRAY_DECRYPTER,
	
	;
	
	private final TranslatedComponent component;
	
	Translation()
	{
		this.component = new TranslatedComponent();
		this.component.key = name();
	}
	
	public TranslatedComponent getTranslatedComponent()
	{
		return component;
	}
}