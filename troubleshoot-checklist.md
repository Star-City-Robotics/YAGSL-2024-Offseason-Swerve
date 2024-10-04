# Troubleshooting checklist
## Common issues faced when this repository was first coded and how they were fixed

### Spazzing motors/wheels oscillating back and forth like crazy on enabling code

- Check for missing, mislocated files.
- Check for P value in PID, if P is too high, the wheels will oscillate violently.

### Wheels can drive forward and backward, but refuses to turn

- Check for P value in PID, if P is too low (in our case 0), the wheels will not turn.
