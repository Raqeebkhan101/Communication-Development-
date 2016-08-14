[y, fs, nbits]=wavread('C:\Matlab\Wave File 02\left.wav'); 
a=0.95; y2 = filter([1, -a], 1, y);% pre-emphasis the left wave file and create new wave file called Amma1.wav
time=(1:length(y))/fs; 
wavwrite(y2, fs, nbits, 'C:\Matlab\Wave File 03\Amma1.wav');
subplot(2,1,1);
plot(time, y); 
title('Original wave: s(n)'); 
subplot(2,1,2);
plot(time, y2);
title(sprintf('After pre-emphasis: s_2(n)=s(n)-a*s(n-1), a=%f', a));
subplot(2,1,1); set(gca, 'unit', 'pixel'); 
axisPos=get(gca, 'position'); 
uicontrol('string', 'Play', 'position', [axisPos(1:2), 60, 20], 'callback', 'sound(y, fs)'); 
subplot(2,1,2); set(gca, 'unit', 'pixel'); 
axisPos=get(gca, 'position'); 
uicontrol('string', 'Play', 'position', [axisPos(1:2), 60, 20], 'callback', 'sound(y2, fs)');