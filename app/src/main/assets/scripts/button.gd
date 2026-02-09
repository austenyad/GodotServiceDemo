extends Button


# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	pass # Replace with function body.


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	pass




func _button_pressed():
	print("AppPlugin not available")
	if Engine.has_singleton("AppPlugin"):
		var plugin = Engine.get_singleton("AppPlugin")
		plugin.showToast("Hello from godot")
	else: 
		print("AppPlugin not available (not running on Android)")


func _on_pressed() -> void:
	pass # Replace with function body.
